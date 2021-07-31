# Karuta Date Step Simulator

An application that takes care of your Karuta date calculations and step notations.


## Current Features
* Tracks your inputs and calculates the resulting stats for each input accordingly.
* Simulates the cooldown of places respawning by enabling/disabling the buttons (according to known Dating rules, f.e. 10-step respawn, Flower never respawning, ...).
* An Undo button to undo single steps and a reset button to start off from the beginning again.

## Planned Features
* Text outputs of finished dates for easier sharing with friends! (Text only at first, hopefully with Emojis included soon afterwards)
* UI improvements!
* JUnit Tests (...that's not really a feature but it'd make my dev life easier)
* Maybe, finally, rename "Spaghett" to "Spaghetti" or "Pasta" and rename "Cocktail" to "Nightclub" ...
* Happily taking any requests (see the bottom of the readme for contact) and see how viable they are to implement!

## How to Download and How to Use

(I'm not very good with GitHub distribution (or distribution in general) so I'll gladly take any advice on improvements here!)

Out of the files you see listed at the top of this page, you want to click on *Karuta_Date_Step_Simulator.zip* and hit the *Download* button on the follow-up page.
Extract the content of the .zip file to your prefered space and head to **Karuta_Date_Step_Simulator** > **bundles** > **Karuta Date Step Simulator**, there you will find an .exe file called **Karuta Date Step Simulator.exe** that'll open up the application.

Short disclaimer: All the code included is open source and fully visible on this GitHub page - as you can see there, it's basically high school code levels, so please don't be worried about any malicious code being included.

Once opened up, you should see this:
![](https://i.imgur.com/iYgFNVS.png)

The *left side* includes all the buttons you'd be able to press during a date as well, as well as the Reset/Undo button.
The *right side* displays multiple lists to show your moves and your stats according to your moves.

The following inputs can be done:
* **🍝 / 🎡 / 🔼 buttons:** Adds a step to the list and calculates according to the input. Basically simulates the inputs you'd do during the date. The first and second column buttons can **grey out** (become disabled), this simulates that they're on cooldown. After 10 moves they'll be **clickable** (become enabled) again, simulating that they've respawned on the map.
* **🔙 button:** Reverts the latest step, bringing you back to the step before. Tracks your stats accordingly and also manages the cooldown of used buttons as well.
* **🔃 button:** Resets the whole simulation and brings you back to the starting position with empty lists and activated buttons.

Once you've input a successful date, your lists will be marked as green:
![](https://i.imgur.com/kjMkRSL.png)

If you happen to run into a date fail, the stat causing the fail will be marked as red. Feel free to use the Undo/Reset buttons to take some steps back!
![](https://i.imgur.com/eXFJDIS.png)

## Known Issues
* Clicking the same button multiple times in a very rapid manner could cause issues within the calculations. This has been a **very rare** occasion but please refrain from spam-clicking buttons super fast.
* Despite the tool being very accurate and successful with it's calculations so far, there's always room for errors when it comes to code. I vouch for a 100% success rate but please feel free to double-check your route and report any issue to me if any issue occurs.

## Final words + Contact
Thanks for reading through the readme and thanks for your interest in using my tool! It's really really appreciated.

Feel free to contact me on Discord at *Crick#8188* for any feedback or issues - even if it's just you using the tool happily, I'd be glad to hear about it!
If anyone is **very happy** with the tool and they feel very generous, I'll also accept ingame donations (most likely any ingame currency) - feel free to contact me as well! It'd be really really appreciated!!
