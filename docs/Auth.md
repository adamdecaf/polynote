# Polynote Auth

## Creating an Account [MISSING]

    POST /users

```json
{
    "useranme": "...",
    "password": "...",
    "email": "..."
}
```

*Returns*

``json
{
    "userId": "..."
}
```

## Logging out [MISSING]

    DELETE /users/:userId

*Returns*

```json
{
    "redirectUrl": "..."
}
```

## Creating a NSFW account [MISSING]

    POST /nsfw/users

```json
{
    "userId": "...",
    "username": "...",
    "email": "..."
}
```

*Returns*

```json
{
    "nsfwUserId": "..."
}
```

## Logging out of a NSFW account [MISSING]

    DELETE /nsfw/users/:userId

*Returns*

```json
{
    "redirectUrl": "..."
}
```
