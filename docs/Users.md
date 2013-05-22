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

    GET /nsfw/users/:userId/details

*Returns*

```json
{
    "userId": "...",
    "username": "...",
    "email": "...",
    "friendCount": ...,
    "likeCount": ...,
    "createdAt": "..."
}
```

## Update user data

    POST /users/details

*Accepts*

```json

```

*Returns*

```json

```

## Update NSFW user data

    POST /nsfw/users/details

*Accepts*

```json

```

*Returns*

```json

```


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

    GET /nsfw/users/:userId/dashboard

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
