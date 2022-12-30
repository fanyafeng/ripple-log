package com.ripple.log.test

/**
 * Author: fanyafeng
 * Date: 2022/6/17 16:43
 * Email: fanyafeng@live.cn
 * Description:
 */

fun <T> test(x: T, y: T & Any): T & Any = x ?: y