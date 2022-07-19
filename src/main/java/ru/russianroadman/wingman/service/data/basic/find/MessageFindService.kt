package ru.russianroadman.wingman.service.data.basic.find

import ru.russianroadman.wingman.entity.Message
import java.util.UUID

interface MessageFindService {

    fun findByIssueId(id: UUID): List<Message>

    fun findByIssueAndClient(issueId: UUID, clientId: UUID): List<Message>

    fun findByIssueAndHelp(issueId: UUID, helpId: UUID): List<Message>

    fun findClientUnreadByIssueId(issueId: UUID): List<Message>

    fun findHelpUnreadByIssueId(issueId: UUID): List<Message>

}