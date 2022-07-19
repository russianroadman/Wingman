package ru.russianroadman.wingman.service.data.basic.create

import ru.russianroadman.wingman.entity.Account

interface AccountCreateService {

    fun create(login: String, password: String): Account

}