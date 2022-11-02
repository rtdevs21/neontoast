Modern Android Toast Build by RTDev

Simple Toast
![Simple Toast](https://github.com/rtdevs21/neontoast/blob/master/app/src/main/res/drawable-v24/simple.png?raw=true)

Wrong Toast
![Wrong Toast](https://github.com/rtdevs21/neontoast/blob/master/app/src/main/res/drawable-v24/wrong.png?raw=true)

Alert Toast
![Alert Toast](https://github.com/rtdevs21/neontoast/blob/master/app/src/main/res/drawable-v24/alert.png?raw=true)

Success Toast
![Success Toast](https://github.com/rtdevs21/neontoast/blob/master/app/src/main/res/drawable-v24/success.png?raw=true)

For add this library in your android Project Please follow simple way from below:

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.rtdevs21:neontoast:$versionCode' 
	}


Leatest Version:
[![](https://jitpack.io/v/rtdevs21/neontoast.svg)](https://jitpack.io/#rtdevs21/neontoast)


Init your Toast

Simple Toast
```ruby
  NeonToast.simple(context,"This Is Simple", Toast.LENGTH_SHORT);
 ```
  Wrong Toast
```ruby
 NeonToast.wrong(context,"This Is Wrong", Toast.LENGTH_SHORT);
```
Alert Toast
```ruby
 NeonToast.info(context,"This Is Alert /Info", Toast.LENGTH_SHORT);
 ```
Success Toast
```ruby
 NeonToast.success(context,"This Is Success", Toast.LENGTH_SHORT);
 ```

