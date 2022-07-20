package ru.russianroadman.wingman.service

enum class UpdateStrategy {

    /**
     * Override according to new object
     */
    REWRITE,

    /**
     * Override according to new object,
     * missing fields will throw an exception
     */
    REWRITE_STRICT,

    /**
     * null values will be not overridden
     */
    IGNORE_NULL,

    /**
     * null values will be not overridden,
     * missing fields will throw an exception
     */
    IGNORE_NULL_STRICT

}