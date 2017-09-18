package bg.devlabs.gamescorer.ui.base


/**
 * Created by Slavi Petrov on 10.08.2017
 * Dev Labs
 * slavi@devlabs.bg
 */
interface MvpView {
    fun showProgress(messageResId: Int)
    fun dismissProgress()
    fun showInfoDialog(message: String)
    fun showInfoDialog(messageResId: Int)
}