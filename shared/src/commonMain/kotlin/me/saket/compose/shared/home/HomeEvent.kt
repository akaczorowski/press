package me.saket.compose.shared.home

import com.benasher44.uuid.Uuid

interface HomeEvent {
  object NewNoteClicked : HomeEvent
  data class OpenNoteClicked(val noteUuid: Uuid): HomeEvent
}