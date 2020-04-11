/*
 * Copyright 2020 Daniel Scherf & Michael Rittmeister & Julian König
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.seliba.devcordbot.command.permission

/**
 * PermissionState returned when checking the user permissions
 */
enum class PermissionState {
    /**
     * Accepted means the command may be executed.
     */
    ACCEPTED,

    /**
     * Declined means the user has no Permission. He will get a permission error.
     */
    DECLINED,

    /**
     * Ignored means the command is ignored for the user.
     */
    IGNORED
}
