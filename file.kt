package br.com.seniorsaudemovel.ui.notification.adapter

import android.content.Context
import android.content.res.ColorStateList
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import br.com.seniorsaudemovel.R
import br.com.seniorsaudemovel.data.model.Message
import br.com.seniorsaudemovel.utils.formatString
import br.com.seniorsaudemovel.utils.isToday
import br.com.seniorsaudemovel.utils.isYesterday
import br.com.seniorsaudemovel.utils.toDateTimeUTC
import java.lang.NullPointerException
import java.util.*

@BindingAdapter("pushTextTitle")
fun setPushTextTitle(tv: TextView, message: Message?) {
    try {
        message?.let {
            tv.text = when {
                getLanguage().contains("pt", true) -> HtmlCompat.fromHtml(
                    it.pt.title, HtmlCompat.FROM_HTML_MODE_LEGACY
                )
                else -> HtmlCompat.fromHtml(
                    it.eng.title, HtmlCompat.FROM_HTML_MODE_LEGACY
                )
            }


        }
    }catch (e: NullPointerException){
        Log.e("exeption","expection")
    }

}

@BindingAdapter("pushTextMessage")
fun setPushTextMessage(tv: TextView, message: Message?) {
    try {
        message?.let {
            val result = when {
                getLanguage().contains("pt", true) -> HtmlCompat.fromHtml(
                    it.pt.text, HtmlCompat.FROM_HTML_MODE_LEGACY
                )
                else -> HtmlCompat.fromHtml(
                    it.pt.text, HtmlCompat.FROM_HTML_MODE_LEGACY
                )
            }
            tv.text = result
        }
    }catch (e:NullPointerException){
        Log.e("exeption","expection2")
    }

}

@BindingAdapter("pushCreatedAt")
fun setPushCreatedAt(tv: TextView, value: String?) {
    value?.let {
        tv.text = when {
            value.toDateTimeUTC().isToday() -> tv.context.getString(R.string.title_today)
                .plus(" ")
                .plus(
                    value.toDateTimeUTC().formatString(tv.context.getString(R.string.format_hour_4))
                )
            value.toDateTimeUTC().isYesterday() -> tv.context.getString(R.string.title_yesterday)
                .plus(" ")
                .plus(
                    value.toDateTimeUTC().formatString(tv.context.getString(R.string.format_hour_4))
                )
            else -> value.toDateTimeUTC().formatString(tv.context.getString(R.string.format_date_1))
        }
    }
}

@BindingAdapter("pushUnread")
fun setPushUnread(view: View, isRead: Boolean) {
    view.setBackgroundColor(
        when (!isRead) {
            true -> ContextCompat.getColor(view.context, R.color.colorItemNoRead)
            else -> ContextCompat.getColor(view.context, R.color.colorBackground)
        }
    )
}


@BindingAdapter("pushIconViewColor")
fun setPushIconColor(view: View, type: String) {
    view.backgroundTintList = ColorStateList.valueOf(getPushColor(view.context, type))
}

@BindingAdapter("pushIcon")
fun setPushIcon(view: ImageView, type: String) {
    val icon: Int? = when {
        type.contains("steps", true) -> R.drawable.ic_steps
        type.contains("calories", true) -> R.drawable.ic_calories
        type.contains("distance", true) -> R.drawable.ic_distance
        type.contains("active-minutes", true) -> R.drawable.ic_ray
        type.contains("fitbit", true) -> R.drawable.ic_fitbit
        else -> null
    }
    icon?.let {
        view.background = ContextCompat.getDrawable(view.context, icon)
        view.backgroundTintList = ColorStateList.valueOf(getPushColor(view.context, type))
    }
}

fun getPushColor(context: Context, type: String) = when {
    type.contains("goal") -> ContextCompat.getColor(context, R.color.colorSteps)
    type.contains("fitbit-access-lost") -> ContextCompat.getColor(context, R.color.colorAcsessLost)
    type.contains(
        Regex("fitbit-access-revoked|fitbit-no-devices|fitbit-inactive")
    ) -> ContextCompat.getColor(context, R.color.colorAcsessRevoke)
    else -> ContextCompat.getColor(context, R.color.colorSecondary)
}


private fun getLanguage() = Locale.getDefault().language
