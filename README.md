# javafx-kiosk-example

## Prepare Ubuntu (16.04 LTS)

1. Remove lightdm package:
`sudo apt-get purge --auto-remove lightdm`

2. Set autologin user:
`agetty -a <username> --noclear %I $TERM`

3. Run startx after login:
In $HOME/.bashrc add lines:
```
if [ $(tty) == "/dev/tty1" ]; then
    startx -- :0
fi
```

4. Deploy java JRE on Ubuntu and install app in /usr/local

5. Create file in '/usr/bin/'
`sudo touch /usr/bin/start-kiosk-app`

6. Edit run file with any editor:
`sudo nano /usr/bin/start-kiosk-app`

```
#!/bin/bash
export DISPLAY=:0
cd /usr/local/kiosk-example/bin
xrandr -s 1360x768
./kiosk-example
```
