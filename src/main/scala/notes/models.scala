package org.decaf.polynote.notes
import org.joda.time.DateTime

case class Note(
  noteId: String,
  userId: String,
  content: String,
  createdAt: DateTime
)
