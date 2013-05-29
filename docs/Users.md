# Polynote Users

## Specific user data [MISSING]

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

## Specific NSFW user data [MISSING]

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

## Update user data [MISSING]

    POST /users/details

*Accepts*

```json

```

*Returns*

```json

```

## Update NSFW user data [MISSING]

    POST /nsfw/users/details

*Accepts*

```json

```

*Returns*

```json

```


## Dashoard Details [MISSING]

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

## NSFW Dashboard Details [MISSING]

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
