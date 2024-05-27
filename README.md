
# Android Architecture Sample App

This is a sample Android application showcasing best practices in Android development using modern libraries and architectural patterns. The app is built with Kotlin and uses Jetpack Compose for the UI, Dagger Hilt for dependency injection, Retrofit for network calls, and Room for local data storage.

## Features

- Modern Android development with Jetpack Compose
- Dependency injection with Dagger Hilt
- REST API calls with Retrofit
- Local database with Room
- Asynchronous programming with Coroutines and Flow
- Image loading with Coil
- Lifecycle-aware components with ViewModel and LiveData
- Navigation with Jetpack Navigation Compose

## Architecture

This app follows the MVVM (Model-View-ViewModel) architecture pattern. The app is divided into the following layers:

- **UI Layer**: Contains the Jetpack Compose UI components.
- **ViewModel Layer**: Manages UI-related data and handles the business logic.
- **Repository Layer**: Abstracts the data sources (both remote and local) and provides data to the ViewModel.
- **Data Layer**: Includes Room for local storage and Retrofit for network operations.

## Technologies Used

- **Kotlin**: Programming language
- **Jetpack Compose**: UI toolkit
- **Dagger Hilt**: Dependency injection
- **Retrofit**: REST API client
- **Coil**: Image loading
- **Coroutines and Flow**: Asynchronous programming
- **Jetpack Navigation Compose**: Navigation

## Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- JDK 8 or later

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/SohailAhmed/AndroidArchitectureSampleApp.git
   cd android-architecture-sample
   ```

2. **Open the project in Android Studio:**

   - Open Android Studio.
   - Click on `Open an existing Android Studio project`.
   - Select the `AndroidArchitectureSampleApp` directory.

3. **Build the project:**

   - Click on `Build > Rebuild Project` in the menu bar.

4. **Run the app:**

   - Click on `Run > Run 'app'` in the menu bar or press `Shift + F10`.

## Usage

This application is designed to demonstrate best practices in Android development. You can explore the source code to understand how different components interact with each other. The main focus areas include:

- **Jetpack Compose**: Look into the `ui` package to see how Composable functions are used to build the UI.
- **Dagger Hilt**: Check the `di` package to see how dependency injection is configured.
- **Retrofit and Room**: Review the `data` package to see how data is fetched from a remote server and stored locally.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
