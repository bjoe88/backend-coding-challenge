package com.personio.reminders.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus


@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
class AuthorizationException(message: String?) : RuntimeException(message) {
}
