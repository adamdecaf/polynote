# Polynote Users

## Specific User Data

    GET /users/:userId/details

*Returns*

```json
{
    "userId": "...",
    "username": "...",
    "email": "...",
    "friendCount": ...,
    "likeCount": ...,,
    "createdAt": "..."
}
```

## Dashoard of Notes

    GET /users/:userId/dashboard

*Returns*

```json
{ // More to add here.
    "notes": [
        "...",
        "...",
        ...
    ],
    "friends": [
        "...",
        "...",
        ...
    ],
    "tags": [
        "...",
        "...",
        ...
    ]
}
```
