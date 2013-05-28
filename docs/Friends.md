# Polynote Friends

## Adding a friend [MOCKED]

    POST /users/:userId/friends/:friendId

Will return a `201 Created` if it can be created and a  `403 Forbidden` if
the request is not authorized. Then a `400 BadRequest` otherwise.

## Viewing friends [MOCKED]

    GET /users/:userId/friends

Will return json like:

```json
{
    "friends": [
        "userId1",
        "userId2",
        ...
    ]
}
```

## Deleting a friend [MOCKED]

    DELETE /users/:userId/friends/:friendId

## Adding a NSFW friend [MISSING]

## Viewing NSFW friends [MISSING]

## Deleting a NSFW friend [MISSING]
