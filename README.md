Sleebit
=================
Sleebit is an alarm app oriented by sleep cycles.

Introduction
------------
A cycle of sleep is a collection of stages that start when a person falls asleep; they'll evolve becoming deeper every time until the body reaches the REM (Rapid Eye Movement) stage.
Usually, the REM stage is the hardest to get in but it is in this stage that the body will rest better and the brain renewal rate is bigger.
An adult needs to sleep between four to five cycles every night, which is almost the eight hours well known recommended.

The goal of this app is to be an alarm where one must select how many cycles one wants to sleep and the app will trigger a notification by the time that one should go to sleep.

Android Studio IDE setup
------------------------
For development, the latest version of Android Studio Arctic Fox is required. Which can be downloaded from [here](https://developer.android.com/studio/preview).

Getting Started
---------------
This project uses the Gradle build system. To build this project, use the `gradlew build` command or use "Import Project" in Android Studio.

Usage
------------------------
Clone this repository and build the master branch using Android Studio

Libraries used
------------------------
* [Foundation][0] - Components for core system capabilities, Kotlin extensions and support for
  multidex and automated testing.
    * [Android KTX][1] - Write more concise, idiomatic Kotlin code.
    * [Test][2] - An Android testing framework for unit and runtime UI tests.
* [Architecture][3] - A collection of libraries that help you design robust, testable, and
  maintainable apps. Start with classes for managing your UI component lifecycle and handling data
  persistence.
    * [Lifecycles][5] - Create a UI that automatically responds to lifecycle events.
* [UI][10] - Details on why and how to use UI Components in your apps - together or separate
    * [Fragment][11] - A basic unit of composable UI.
    * [Compose][11] - Jetpack Compose is Android’s modern toolkit for building native UI.

[0]: https://developer.android.com/jetpack/components
[1]: https://developer.android.com/kotlin/ktx
[2]: https://developer.android.com/training/testing/
[3]: https://developer.android.com/jetpack/arch/
[5]: https://developer.android.com/topic/libraries/architecture/lifecycle
[10]: https://developer.android.com/guide/topics/ui
[11]: https://developer.android.com/guide/components/fragments
[15]: https://developer.android.com/jetpack/compose

Upcoming features
-----------------
As the first version is in active development you can check out the upcoming features in the issues tab.

License
-------
Copyright 2021 Lucas Gomes.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.