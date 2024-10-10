package skipvalidator.module

import skip.lib.*

import skip.foundation.*


class SKIPValidatorModule {
    /// Retrieve a value.
    //    public func string(forKey key: String) throws -> String? {
    //#if !SKIP
    //        guard let data = try data(forKey: key) else {
    //            return nil
    //        }
    //        guard let string = String(data: data, encoding: .utf8) else {
    //            throw KeychainError(invalidValue: true)
    //        }
    //        return string
    //#else
    //        do {
    //            let prefs = try initializePreferences()
    //            return prefs.getString(key, nil)
    //        } catch {
    //            throw KeychainError(message: error.localizedDescription)
    //        }
    //#endif
    //    }

    companion object {
        /// The shared skip module.
        val shared = SKIPValidatorModule()

        fun validateEmail(email: String): Boolean {
            //        let emailRegEx = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"
            //        let emailPred = NSPredicate(format:"SELF MATCHES %@", emailRegEx)

            return email.contains(".") && email.contains("@")
        }
    }
}
