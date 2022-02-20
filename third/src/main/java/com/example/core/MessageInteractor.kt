package com.example.core

import com.example.first.Foo
import com.example.second.Fighters
import javax.inject.Inject

class MessageInteractor @Inject constructor(
    private val foo: Foo,
    private val fighters: Fighters,
) {
    fun prepareMessage(): String = "${foo.title} ${fighters.title} is awesome!"
}