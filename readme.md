# Demo Project
This demo project is intended to show a problem with Eclipse PDE which occured anywhere between Eclipse 4.22 and Eclipse 4.26.
In Eclipse 4.22 (2021_12) a fragments host version for a host with a build quilifer version part could reference the final version (e.g. 1.0.0).
This does not work in Eclipse 4.26 (2022_12) where you have to set the minimum host version to 1.0.0.qualifier.
