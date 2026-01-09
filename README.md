# LearnLoginjc

A small Android Jetpack Compose sample app that demonstrates a polished login flow and a simple clean home screen.

## What this project contains

- Polished Login screen (Compose)
  - Full-screen background image with a semi-transparent vertical overlay for improved readability.
  - Centered card-like Surface that contains the form for clear visual hierarchy.
  - Username field (OutlinedTextField) with icon.
  - Password field with a visibility toggle and masked input by default.
  - Login button shows a loading indicator while authenticating and is disabled during the request.
  - Demo authentication (local): credentials are `admin` / `admin123`.
  - Toasts for success/failure and navigation to the Home screen on success.

- Navigation
  - `NavGraph` (Compose Navigation) with two routes: `login` and `home`.
  - On successful login the app navigates to `home` and removes the login screen from the backstack.

- Home screen
  - Clean, readable Home UI (no background image) with a visible `Logout` button.
  - Logout navigates back to the login screen and clears the Home route from the backstack.

- Files changed/added
  - `app/src/main/java/com/example/learnloginjc/MainActivity.kt` — login UI, nav graph, and wiring.
  - `app/src/main/java/com/example/learnloginjc/Home.kt` — Home screen with logout.

## How to run

Open the project in Android Studio (recommended) and run the app on an emulator or device.

Or build from the command line (PowerShell on Windows):

```powershell
# Build debug APK
.\gradlew assembleDebug

# Install and run on a connected device (optional)
# .\gradlew installDebug
```

Then launch the app on the device/emulator.

Test the login flow using the demo credentials:

- Username: `admin`
- Password: `admin123`

After tapping Login you should be navigated to the Home screen where a Logout button is visible — tap Logout to return to the login screen.


- Move large Composables (`LoginScreen`, `HomeScreen`, `NavGraph`) into their own files for project clarity (optional refactor).
- Consider adding biometric login and secure token storage for production.

If you'd like, I can implement any of the next steps above (keyboard IME handling, field validation, biometric, or moving components into separate files).
