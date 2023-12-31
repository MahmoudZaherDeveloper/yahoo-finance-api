# Yahoo Finance API 

This API helps to query for all information about finance summary, stocks, quotes, movers, etc… as on [finance.yahoo.com](url)

This API reproduces live PUBLIC data and features of [finance.yahoo.com](url). The response data is always live and synced with the site at request time. You are going to get almost everything that you see PUBLICLY on the site.

# Implementation
- In this project I applied Clean architecture with (MVVM Pattern + State Management) to apply Separation of concerns.
- Using kotlin coroutines to handle heavy operations on the background thread.
- Using Hilt for dependency injection that will make code cleaner and more readable and handy when creating dependecies and testable easier.
- I have used a compination of **Compose** and Normal XML.
- Using Retrofit to implement Api calls.

# Clean Architecture 
![clean_architecture_reloaded_main](https://user-images.githubusercontent.com/18033003/164913756-59ce32bb-ba5a-4f5b-ba44-64b046a297f4.png)

# Clean Architecture layers 
![clean_architecture_reloaded_layers (1)](https://user-images.githubusercontent.com/18033003/164913902-7cba853b-784e-4092-8d14-317838e4b2cd.png)

## Tech Stack
- kotlin.
- Compose
- Clean Architecure with (MVVM + StateManagement).
- Coroutines.
- Retrofit2.
- recycler view.
- ConstraintLayout.
- viewmodel and MutableStateFlow.
- view binding.
- Dagger Hilt for DI.
