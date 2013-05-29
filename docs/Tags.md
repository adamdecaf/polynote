# Polynote Tags

## Viewing a user's tags [MISSING]

    GET /users/:userId/tags

Will return:

```json
{
    "tags": [
        {
            "tagId": "...",
            "name": "...",
            "notes": [
                "..",
                ...
            ]
        },
        {
            "tagId": "...",
            "name": "...",
            "notes": [
                "..",
                ...
            ]
        }
    ]
}
```

## Get tags for a post [MISSING]

    GET /notes/:noteId/tags

Will return

```json
{
    "tags": [
        {
            "tagId": "...",
            "name": "..."
        }
    ]
}
```

## Adding a tag to a post [MISSING]

    POST /notes/:noteId/tags

Will return `OK 200` on success

## Removing a tag from a note [MISSING]

    DELETE /notes/:noteId/tags/:tagId

Will return `OK 200` on success
