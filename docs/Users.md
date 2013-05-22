# Polynote Users

## Specific user data

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

## Specific NSFW user data

## Update user data

## Update NSFW user data

## Dashoard Details

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

## NSFW Dashboard Details
