/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Lizhaotailang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
@file:JvmName("Light")

package io.github.tonnyl.light

import android.graphics.drawable.Drawable
import android.support.annotation.*
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.View

/**
 * Created by lizhaotailang on 2017/5/5.
 *
 * [Light] is an expand class of [Snackbar], in order to custom
 * the text color, the background color, the action text color and so on.
 * Definitely, you can use [Light] as [Snackbar] as you always do.
 *
 * Several methods are defined that return the customized [Snackbar]
 * and you can call them anytime. And you can create your own [Snackbar].
 *
 * [Light] is inspired by [Toasty](https://github.com/GrenderG/Toasty).
 *
 */

/** set the Snackbar in the top location */
const val TOP = Gravity.TOP

/** set the Snackbar in the bottom location */
const val BOTTOM = Gravity.BOTTOM

@CheckResult
fun success(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = success(view, textId, duration, BOTTOM)

@CheckResult
fun success(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = success(view, view.context.getString(textId), duration, gravity)

@CheckResult
fun success(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = success(view, text, duration, BOTTOM)

@CheckResult
fun success(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = make(view, text, duration, R.drawable.ic_success_white_24dp, R.color.color_success, gravity = gravity)

@CheckResult
fun error(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = error(view, textId, duration, BOTTOM)

@CheckResult
fun error(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = error(view, view.context.getText(textId), duration, gravity)

@CheckResult
fun error(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = error(view, text, duration, BOTTOM)

@CheckResult
fun error(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = make(view, text, duration, R.drawable.ic_error_24dp, R.color.color_error, gravity = gravity)

@CheckResult
fun info(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = info(view, textId, duration, BOTTOM)

@CheckResult
fun info(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = info(view, view.context.getText(textId), duration, gravity)

@CheckResult
fun info(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = info(view, text, duration, BOTTOM)

@CheckResult
fun info(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = make(view, text, duration, R.drawable.ic_info_outline_white_24dp, R.color.color_info, gravity = gravity)

@CheckResult
fun warning(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = warning(view, textId, duration, BOTTOM)

@CheckResult
fun warning(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = warning(view, view.context.getText(textId), duration, gravity)

@CheckResult
fun warning(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = warning(view, text, duration, BOTTOM)

@CheckResult
fun warning(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = make(view, text, duration, R.drawable.ic_warning_outline_white_24dp, R.color.color_warning, gravity = gravity)

@CheckResult
fun normal(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = normal(view, textId, duration, BOTTOM)

@CheckResult
fun normal(view: View, @StringRes textId: Int, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = normal(view, view.context.getText(textId), duration, gravity)

@CheckResult
fun normal(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT):
        TBSnackBar = normal(view, text, duration, BOTTOM)

@CheckResult
fun normal(view: View, text: CharSequence, duration: Int = Snackbar.LENGTH_SHORT, gravity: Int = BOTTOM):
        TBSnackBar = make(view, text, duration, null,
        backgroundColorInt = ContextCompat.getColor(view.context, R.color.color_normal), gravity = gravity)

@CheckResult
fun make(view: View,
         @StringRes textRes: Int,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white
): TBSnackBar = make(view, textRes, duration, textIconRes, backgroundColorRes, textColorRes, BOTTOM)

@CheckResult
fun make(view: View,
         @StringRes textRes: Int,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white,
         gravity: Int = BOTTOM
): TBSnackBar = make(view, view.context.getString(textRes), duration,
        textIconRes, backgroundColorRes, textColorRes, gravity)

@CheckResult
fun make(view: View,
         text: CharSequence,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white
): TBSnackBar = make(view, text, duration, textIconRes, backgroundColorRes, textColorRes, BOTTOM)

@CheckResult
fun make(view: View,
         text: CharSequence,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white,
         gravity: Int = BOTTOM
): TBSnackBar = make(view, text, duration,
        ContextCompat.getDrawable(view.context, textIconRes),
        ContextCompat.getColor(view.context, backgroundColorRes),
        ContextCompat.getColor(view.context, textColorRes), gravity)

@CheckResult
fun make(view: View,
         @StringRes textRes: Int,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white,
         @DrawableRes actionIconRes: Int,
         @ColorRes actionTextColorRes: Int = android.R.color.white
): TBSnackBar = make(view, textRes, duration, textIconRes,
        backgroundColorRes, textColorRes, actionIconRes, actionTextColorRes, BOTTOM)

@CheckResult
fun make(view: View,
         @StringRes textRes: Int,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white,
         @DrawableRes actionIconRes: Int,
         @ColorRes actionTextColorRes: Int = android.R.color.white,
         gravity: Int = BOTTOM
): TBSnackBar = make(view, view.context.getString(textRes), duration, textIconRes,
        backgroundColorRes, textColorRes, actionIconRes, actionTextColorRes, gravity)

@CheckResult
fun make(view: View,
         text: CharSequence,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white,
         @DrawableRes actionIconRes: Int,
         @ColorRes actionTextColorRes: Int = android.R.color.white
): TBSnackBar = make(view, text, duration, textIconRes, backgroundColorRes,
        textColorRes, actionIconRes, actionTextColorRes, BOTTOM)

@CheckResult
fun make(view: View,
         text: CharSequence,
         duration: Int = Snackbar.LENGTH_SHORT,
         @DrawableRes textIconRes: Int,
         @ColorRes backgroundColorRes: Int = R.color.color_normal,
         @ColorRes textColorRes: Int = android.R.color.white,
         @DrawableRes actionIconRes: Int,
         @ColorRes actionTextColorRes: Int = android.R.color.white,
         gravity: Int = BOTTOM
): TBSnackBar = make(view, text, duration,
        ContextCompat.getDrawable(view.context, textIconRes),
        ContextCompat.getColor(view.context, backgroundColorRes),
        ContextCompat.getColor(view.context, textColorRes),
        ContextCompat.getDrawable(view.context, actionIconRes),
        ContextCompat.getColor(view.context, actionTextColorRes), gravity)

/**
 * Make a customized [Snackbar] to display a message without any action.
 *
 * @param view The view to find a parent from.
 * @param text The message to display. Formatted text is supported.
 * @param duration How long to show the message. Either [Snackbar.LENGTH_SHORT] or [Snackbar.LENGTH_LONG].
 * Default length is [Snackbar.LENGTH_SHORT].
 * @param textIcon The left icon of the message. [Drawable] is required.
 * @param backgroundColorInt The background color of the Snackbar. It should be a resolved color ([ColorInt]).
 * @param textColorInt The color of message text. Resolved color ([ColorInt]) is required.
 * @param gravity Setting the Snackbar location. Either [TOP] or [BOTTOM].
 *
 * @return The customized Snackbar that will be displayed.
 */
@CheckResult
fun make(view: View,
         text: CharSequence,
         duration: Int = Snackbar.LENGTH_SHORT,
         textIcon: Drawable?,
         @ColorInt backgroundColorInt: Int = ContextCompat.getColor(view.context, R.color.color_normal),
         @ColorInt textColorInt: Int = ContextCompat.getColor(view.context, android.R.color.white),
         gravity: Int = BOTTOM
): TBSnackBar = TBSnackBar().make(view, text, duration, textIcon,
        backgroundColorInt, textColorInt, gravity)

/**
 * Make a customized [Snackbar] to display a message without any action.
 * Method [Light.make] is called internal.
 *
 * @param view The view to find a parent from.
 * @param text The message to display. Formatted text is supported.
 * @param duration How long to show the message. Either [Snackbar.LENGTH_SHORT] or [Snackbar.LENGTH_LONG].
 * Default length is [Snackbar.LENGTH_SHORT].
 * @param textIcon The left icon of the message. [Drawable] is required.
 * @param backgroundColorInt The background color of the Snackbar. It should be a resolved color.
 * @param textColorInt The color of message text. Resolved color ([ColorInt]) is required.
 * @param actionIcon The left icon of action message text. [Drawable] is required.
 * @param actionTextColorInt The color of action message text. Resolved color ([ColorInt]) is required.
 * @param gravity Setting the Snackbar location. Either [TOP] or [BOTTOM].
 *
 * @return The customized Snackbar that will be displayed.
 */
@CheckResult
fun make(view: View,
         text: CharSequence,
         duration: Int = Snackbar.LENGTH_SHORT,
         textIcon: Drawable?,
         @ColorInt backgroundColorInt: Int = ContextCompat.getColor(view.context, R.color.color_normal),
         @ColorInt textColorInt: Int = ContextCompat.getColor(view.context, android.R.color.white),
         actionIcon: Drawable?,
         @ColorInt actionTextColorInt: Int = ContextCompat.getColor(view.context, android.R.color.white),
         gravity: Int = BOTTOM
): TBSnackBar = TBSnackBar().make(view, text, duration, textIcon, backgroundColorInt,
        textColorInt, actionIcon, actionTextColorInt, gravity)

