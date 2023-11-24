package interface_adapters.signup;

import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;

public class SignupController {

    final SignupInputBoundary userSignupUseCaseInteractor;
    public SignupController(SignupInputBoundary userSignupUseCaseInteractor) {
        this.userSignupUseCaseInteractor = userSignupUseCaseInteractor;
    }

    public void execute(String username, String password1, String password2, boolean isReturning) {
        SignupInputData signupInputData = new SignupInputData(
                username, password1, password2, isReturning);

        userSignupUseCaseInteractor.execute(signupInputData);
    }
}
