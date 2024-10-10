#if !SKIP
import Foundation
#else
import SkipFoundation
#endif


public struct SKIPValidatorModule {
    /// The shared skip module.
    public static let shared = SKIPValidatorModule()
    
    public static func validateEmail(email:String) -> Bool {
//        let emailRegEx = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"
//        let emailPred = NSPredicate(format:"SELF MATCHES %@", emailRegEx)
        
        return email.contains(".")&&email.contains("@")
    }
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
}
