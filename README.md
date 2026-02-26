# AlphaEdge — AI Stock Paper Trader
## How to Get Your APK (3 Methods)

---

## ✅ METHOD 1 — GitHub Actions (EASIEST — No PC needed, fully online)

1. Go to **github.com** and create a free account
2. Create a new repository called `alphaedge`
3. Upload ALL files from this zip (maintain folder structure)
4. GitHub automatically runs the build workflow
5. Go to: `github.com/YOUR_USERNAME/alphaedge/actions`
6. Click the latest workflow run → scroll down to **Artifacts**
7. Download **AlphaEdge-debug.zip** → extract → get `app-debug.apk`
8. Transfer APK to your Android phone and install it

---

## ✅ METHOD 2 — Android Studio (PC/Mac)

1. Install Android Studio: developer.android.com/studio
2. Install JDK 17: adoptium.net
3. Open Android Studio → File → Open → select this folder
4. Wait for Gradle sync (~2 min)
5. Build → Build APK(s) → Build APK(s)
6. APK is at: `app/build/outputs/apk/debug/app-debug.apk`

---

## ✅ METHOD 3 — Command Line (PC/Mac)

```bash
# Make sure ANDROID_HOME is set and Java 17 is installed
./gradlew assembleDebug
# APK: app/build/outputs/apk/debug/app-debug.apk
```

---

## Installing the APK on Android

1. Transfer `app-debug.apk` to your phone
2. Open Settings → Security → Enable **"Install unknown apps"**
3. Tap the APK file → Install
4. Open **AlphaEdge** from your app drawer

---

## App Features
- Real-time stock data via Alpha Vantage API
- AI conviction scoring (0-100) per stock
- Technical analysis: RSI, MACD, SMA20/50
- Fundamental analysis: P/E, EPS growth, margins
- News & sentiment analysis
- Paper trading engine with full P&L tracking
- Auto-trading toggle
- 10 stocks: AAPL MSFT NVDA TSLA GOOGL AMZN META JPM V UNH
