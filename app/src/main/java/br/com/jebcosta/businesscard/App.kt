package br.com.jebcosta.businesscard

import android.app.Application
import br.com.jebcosta.businesscard.data.AppDatabase
import br.com.jebcosta.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val respository by lazy { BusinessCardRepository(database.businessDao()) }
}