package com.luckyshane.cnblogs.model.entity

data class Blog(val id: String,
                var title: String,
                var subtitle: String,
                var avatarUrl: String = "",
                var authorName: String = "",
                var readCount: Int = 0,
                var commentCount: Int = 0)