package dev.saurabhmishra.githubpullrequests.extensions

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun String.formatPullRequestDate(): String {
    return LocalDateTime.ofInstant(Instant.parse(this), ZoneId.systemDefault()).format(
        DateTimeFormatter.ofPattern("dd MMM yyyy")
    )
}