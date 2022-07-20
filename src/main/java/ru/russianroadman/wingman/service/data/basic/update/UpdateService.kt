package ru.russianroadman.wingman.service.data.basic.update

import ru.russianroadman.wingman.data.UpdateContext
import ru.russianroadman.wingman.service.UpdateStrategy
import java.util.*

interface UpdateService<T> {

    fun update(updateContext: UpdateContext<T>, strategy: UpdateStrategy): T

    fun update(update: T, mapTo: T, strategy: UpdateStrategy): T

    fun update(update: UUID, mapTo: T, strategy: UpdateStrategy): T

}