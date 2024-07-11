package com.nqmgaming.movietmdb.core.util

import com.nqmgaming.movietmdb.core.util.Constants.IMAGE_BASE_URL

fun String.toImageBaseUrl() = "${IMAGE_BASE_URL}$this"