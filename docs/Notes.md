# Polynote Notes

## Get a specific note [MISSING]

    GET /notes/:noteId

Will return the following json

```json
{
    "noteId": "...",
    "userId": "...",
    "content": "...",
    "createdAt": "..."
}
```

## Creating a note [MISSING]

    POST /notes

With the body as the note's content.

Will then return something like:

```json
{
    "noteId": "..."
}
```

## Editing a note [MISSING]

    PUT /notes/:noteId

With the body as the note's content.

## Deleting a note [MISSING]

    DELETE /notes/:noteId

Will return `OK 200` on success.

## Liking a note [MISSING]

    POST /notes/:noteId/likes

Will return `OK 200` on success.

## Promoting a note [MISSING]

    POST /notes/:noteId/promotions

Will return `OK 200` on success.

## Search through notes [MISSING]

    GET /notes

**Params**

* `text`: Search the note's text.
* `author`: Search by the authors id/name

Will return

```json
{
    "notes": [
        {
            "noteId": ""
            "userId": "...",
            "content": "...",
            "createdAt": "..."
        }
    ]
}
```
