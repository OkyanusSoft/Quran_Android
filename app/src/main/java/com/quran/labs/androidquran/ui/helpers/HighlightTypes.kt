package com.quran.labs.androidquran.ui.helpers

import com.quran.labs.androidquran.R
import com.quran.labs.androidquran.ui.helpers.HighlightType.Mode.HIGHLIGHT

object HighlightTypes {

  @JvmField
  val SELECTION = HighlightType(1,  R.color.selection_highlight, HIGHLIGHT, isSingle = true)
  val AUDIO =     HighlightType(2,  R.color.audio_highlight,     HIGHLIGHT, isSingle = true, isTransitionAnimated = true)
  val NOTE =      HighlightType(3,  R.color.note_highlight,      HIGHLIGHT)
  @JvmField
  val BOOKMARK =  HighlightType(4,  R.color.bookmark_highlight,  HIGHLIGHT)

  fun getAnimationConfig(type: HighlightType): HighlightAnimationConfig = when(type) {
    AUDIO -> HighlightAnimationConfig.Audio
    else -> HighlightAnimationConfig.None
  }
}
