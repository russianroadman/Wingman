package ru.russianroadman.wingman.data

interface UpdateContext<T> {

    fun put(t: T)

    fun asNullObject(): T

}