package me.saket.compose.shared.editor

interface EditorEvent {
  data class NoteTextChanged(val text: CharSequence) : EditorEvent
}