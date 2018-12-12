# javafx-kiosk-example

### Prepare Ubuntu (16.04 LTS)

- Remove lightdm package:
```
sudo apt-get purge --auto-remove lightdm
```
- Set autologin user:
```
agetty -a <username> --noclear %I $TERM
```
- In `$HOME/.bashrc` add lines:
```
if [ $(tty) == "/dev/tty1" ]; then
    startx -- -layout Multihead :0
fi
```
- Deploy java JRE on Ubuntu and install app in `/usr/local`
- Create file in `/usr/bin/`

```
sudo touch /usr/bin/start-kiosk-app
```
- Edit run file with any editor:

```
sudo nano /usr/bin/start-kiosk-app
```

```
#!/bin/bash
export DISPLAY=:0
cd /usr/local/kiosk-example/bin
#Set your resolution
xrandr -s 1360x768
./kiosk-example
```

- Create xinit config file:
```
echo start-kiosk-app > $HOME.xinitrc 
```