# APPSERFITV25

Este proyecto es una aplicación de ejemplo para Android basada en Jetpack Compose.
Es el esqueleto inicial generado por Android Studio y se puede usar como punto de partida.

## Requisitos

 - **Android SDK** instalado y configurado. Puedes definir la variable de entorno `ANDROID_HOME` o crear un archivo `local.properties` con la línea `sdk.dir=/ruta/al/sdk`. 
   Se incluye un archivo `local.properties.example` como referencia.
- **Java 17** o compatible.

## Compilación y ejecución

Para compilar la aplicación desde la línea de comandos utiliza el *wrapper* de Gradle:

```bash
./gradlew assembleDebug
```

Si utilizas Windows, ejecuta:

```bat
gradlew.bat assembleDebug
```

La aplicación resultante se encontrará en `app/build/outputs/apk/`.

## Pruebas

Para ejecutar las pruebas unitarias:

```bash
./gradlew test
```

> **Nota**: Es necesario que el Android SDK esté correctamente configurado para que las pruebas se ejecuten con éxito.

## Licencia

Este proyecto se distribuye bajo la licencia [MIT](LICENSE).

