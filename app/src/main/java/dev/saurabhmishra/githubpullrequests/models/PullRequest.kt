package dev.saurabhmishra.githubpullrequests.models
import android.os.Parcelable

import kotlinx.parcelize.Parcelize
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Json


data class PullRequests(
    val requests: List<PullRequest>
)

@JsonClass(generateAdapter = true)
@Parcelize
data class PullRequest(
    @Json(name = "active_lock_reason")
    val activeLockReason: String? = null,
    @Json(name = "assignee")
    val assignee: Assignee? = null,
    @Json(name = "assignees")
    val assignees: List<Assignee>? = null,
    @Json(name = "author_association")
    val authorAssociation: String? = null,
    @Json(name = "auto_merge")
    val autoMerge: Boolean? = null,
    @Json(name = "base")
    val base: Base? = null,
    @Json(name = "body")
    val body: String? = null,
    @Json(name = "closed_at")
    val closedAt: String? = null,
    @Json(name = "comments_url")
    val commentsUrl: String? = null,
    @Json(name = "commits_url")
    val commitsUrl: String? = null,
    @Json(name = "created_at")
    val createdAt: String? = null,
    @Json(name = "diff_url")
    val diffUrl: String? = null,
    @Json(name = "draft")
    val draft: Boolean? = null,
    @Json(name = "head")
    val head: Head? = null,
    @Json(name = "html_url")
    val htmlUrl: String? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "issue_url")
    val issueUrl: String? = null,
    @Json(name = "labels")
    val labels: List<Label>? = null,
    @Json(name = "_links")
    val links: Links? = null,
    @Json(name = "locked")
    val locked: Boolean? = null,
    @Json(name = "merge_commit_sha")
    val mergeCommitSha: String? = null,
    @Json(name = "merged_at")
    val mergedAt: String? = null,
    @Json(name = "milestone")
    val milestone: Milestone? = null,
    @Json(name = "node_id")
    val nodeId: String? = null,
    @Json(name = "number")
    val number: Int? = null,
    @Json(name = "patch_url")
    val patchUrl: String? = null,
    @Json(name = "requested_reviewers")
    val requestedReviewers: List<User>? = null,
    @Json(name = "requested_teams")
    val requestedTeams: List<RequestedTeam>? = null,
    @Json(name = "review_comment_url")
    val reviewCommentUrl: String? = null,
    @Json(name = "review_comments_url")
    val reviewCommentsUrl: String? = null,
    @Json(name = "state")
    val state: String? = null,
    @Json(name = "statuses_url")
    val statusesUrl: String? = null,
    @Json(name = "title")
    val title: String? = null,
    @Json(name = "updated_at")
    val updatedAt: String? = null,
    @Json(name = "url")
    val url: String? = null,
    @Json(name = "user")
    val user: User? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Assignee(
    @Json(name = "avatar_url")
    val avatarUrl: String? = null,
    @Json(name = "events_url")
    val eventsUrl: String? = null,
    @Json(name = "followers_url")
    val followersUrl: String? = null,
    @Json(name = "following_url")
    val followingUrl: String? = null,
    @Json(name = "gists_url")
    val gistsUrl: String? = null,
    @Json(name = "gravatar_id")
    val gravatarId: String? = null,
    @Json(name = "html_url")
    val htmlUrl: String? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "login")
    val login: String? = null,
    @Json(name = "node_id")
    val nodeId: String? = null,
    @Json(name = "organizations_url")
    val organizationsUrl: String? = null,
    @Json(name = "received_events_url")
    val receivedEventsUrl: String? = null,
    @Json(name = "repos_url")
    val reposUrl: String? = null,
    @Json(name = "site_admin")
    val siteAdmin: Boolean? = null,
    @Json(name = "starred_url")
    val starredUrl: String? = null,
    @Json(name = "subscriptions_url")
    val subscriptionsUrl: String? = null,
    @Json(name = "type")
    val type: String? = null,
    @Json(name = "url")
    val url: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Base(
    @Json(name = "label")
    val label: String? = null,
    @Json(name = "ref")
    val ref: String? = null,
    @Json(name = "repo")
    val repo: Repository? = null,
    @Json(name = "sha")
    val sha: String? = null,
    @Json(name = "user")
    val user: User? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Head(
    @Json(name = "label")
    val label: String? = null,
    @Json(name = "ref")
    val ref: String? = null,
    @Json(name = "repo")
    val repo: Repository? = null,
    @Json(name = "sha")
    val sha: String? = null,
    @Json(name = "user")
    val user: User? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Label(
    @Json(name = "color")
    val color: String? = null,
    @Json(name = "default")
    val default: Boolean? = null,
    @Json(name = "description")
    val description: String? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "node_id")
    val nodeId: String? = null,
    @Json(name = "url")
    val url: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Links(
    @Json(name = "comments")
    val comments: Comments? = null,
    @Json(name = "commits")
    val commits: Commits? = null,
    @Json(name = "html")
    val html: Html? = null,
    @Json(name = "issue")
    val issue: Issue? = null,
    @Json(name = "review_comment")
    val reviewComment: ReviewComment? = null,
    @Json(name = "review_comments")
    val reviewComments: ReviewComments? = null,
    @Json(name = "self")
    val self: Self? = null,
    @Json(name = "statuses")
    val statuses: Statuses? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Milestone(
    @Json(name = "closed_at")
    val closedAt: String? = null,
    @Json(name = "closed_issues")
    val closedIssues: Int? = null,
    @Json(name = "created_at")
    val createdAt: String? = null,
    @Json(name = "creator")
    val creator: User? = null,
    @Json(name = "description")
    val description: String? = null,
    @Json(name = "due_on")
    val dueOn: String? = null,
    @Json(name = "html_url")
    val htmlUrl: String? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "labels_url")
    val labelsUrl: String? = null,
    @Json(name = "node_id")
    val nodeId: String? = null,
    @Json(name = "number")
    val number: Int? = null,
    @Json(name = "open_issues")
    val openIssues: Int? = null,
    @Json(name = "state")
    val state: String? = null,
    @Json(name = "title")
    val title: String? = null,
    @Json(name = "updated_at")
    val updatedAt: String? = null,
    @Json(name = "url")
    val url: String? = null
) : Parcelable


@JsonClass(generateAdapter = true)
@Parcelize
data class RequestedTeam(
    @Json(name = "description")
    val description: String? = null,
    @Json(name = "html_url")
    val htmlUrl: String? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "members_url")
    val membersUrl: String? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "node_id")
    val nodeId: String? = null,
    @Json(name = "permission")
    val permission: String? = null,
    @Json(name = "privacy")
    val privacy: String? = null,
    @Json(name = "repositories_url")
    val repositoriesUrl: String? = null,
    @Json(name = "slug")
    val slug: String? = null,
    @Json(name = "url")
    val url: String? = null
) : Parcelable


@JsonClass(generateAdapter = true)
@Parcelize
data class Comments(
    @Json(name = "href")
    val href: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Commits(
    @Json(name = "href")
    val href: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Html(
    @Json(name = "href")
    val href: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Issue(
    @Json(name = "href")
    val href: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class ReviewComment(
    @Json(name = "href")
    val href: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class ReviewComments(
    @Json(name = "href")
    val href: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Self(
    @Json(name = "href")
    val href: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Statuses(
    @Json(name = "href")
    val href: String? = null
) : Parcelable
