# COVID_INFO_ANDROID_APPLICATION
## Implemented in this project:
- Intent
- BroadcastReceiver
- Animation
- RecyclerView
- Database

## Abstract:
Covid Info App is an android app developed to get basic information of COVID-19 like symptoms, precautions, live information of infected, recovered and deceased cases of COVID-19.

## Steps Of This Project:

STEP1: Create a new project.

STEP2: In activity_main.xml design UI:
	Firstly, a textview with Heading of COVID-19
	Secondly, 3 textviews that display infected, recovered and deceased cases of COVID in a cardview.
	Then a Linear layout consisting a recycler view in horizontal orientation that has Symptoms of covid in it and a button of view all.
	Next one more cardview with button for more information of COVID-19.
	Lastly a linear layout consisting a recycler view in horizontal orientation that has Precautions of covid in it and a button of view all.

Step3: In MainActivity.kt
	Access 1st recyclerView and add data in it, same with other.Then add intent on 2 view all buttons and intent to knowmoreinfo button too. Add a function 		globalDat aadd url and fetch data from that url in JSON object and set it to textviews of infected,deceased and recovered.

Step4: SymptomsAdapter.kt and PrecautionAdapter.kt
	Prepare two adapters for two recyclerView used in main activity.

Step5: activity_splashscreen
	First page of applicaton with one animation(spin), overview of app and 	button of get started.

Step6: Splashscreen.kt
	Load animation and intent for button get started to next page.

Step7: PrecautionActivity.kt and SysmptomsActivity.kt 
	For adding all the data that will be displayed after clicking view all.

Step8: item_symptoms.xml and item_precaution.xml
	Designing listitem in recyclerview.

Step9: CallReceiver.kt
	Adding BroadcastReceiver in this file for incoming call.

Step10: activity_login.xml
	Design cardview for entering email and password. Two buttons login and next.

Step11: LoginActivity.kt
	Fetch data using id of email and password and store using SharedPreferences by clicking button login. And add intent in next button.


*Add required drawable,anim in res folder
*Add required permissions and receiver for broadcast in manifest file. 
	

	
![output](https://user-images.githubusercontent.com/68602671/146313221-d5057126-73b3-4b4b-8b2c-773a93523af1.jpeg)

 
