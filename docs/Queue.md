# Polynote Queue

## Creating a QueuedNote [MISSING]

    POST /notes/:noteId/queue

With json of:

```json
{
    "postDate": 1234567890
}
```

Will return `OK 200` on success.

## Viewing QueuedNotes [MISSING]

    GET /users/:noteId/queue

Will return

```json
{
    "queue": [
        {
            "noteId": "...",
            "title": "..."
        },
        {
            "noteId": "...",
            "title": "..."
        }
    ]
}
```

## Deleting a QueuedNote [MISSING]

    DELETE /notes/:noteId/queue

Will return `OK 200` on success.

## Creating a NSFW QueuedNote [MISSING]

## Viewing NSFW QueuedNotes [MISSING]

## Deleting a NSFW QueuedNote [MISSING]
