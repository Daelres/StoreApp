package me.danielrestrepo.storeapp

fun validateEmail(email: String): Pair<Boolean, String> {
    val emailRegex = Regex(
        "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
    )
    return if (emailRegex.matches(email)) {
        Pair(true, "")
    } else {
        Pair(false, "Invalid email format")
    }
}

fun validatePassword(password: String): Pair<Boolean, String> {
    val passwordRegex = Regex(
        "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"
    )
    return if (passwordRegex.matches(password)) {
        Pair(true, "")
    } else {
        Pair(false, "Password must be at least 8 characters long and contain at least one letter and one number")
    }
}