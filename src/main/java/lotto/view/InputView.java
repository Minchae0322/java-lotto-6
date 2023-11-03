package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.exception.Validator;
import lotto.util.Parser;

import java.util.List;

public class InputView {
    public static int readPurChaseLottoAmount() {
        String amount = "";
        try {
            System.out.println("구입금액을 입력해 주세요.");
            amount = Console.readLine();
            Validator.validatePurChaseAmount(amount);
        } catch (IllegalArgumentException e) {
            readPurChaseLottoAmount();
        }
        System.out.println();
        return Integer.parseInt(amount) / 1000;
    }

    public static List<Integer> readWinningNumber() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String winningNum = Console.readLine();
        Validator.validateWinningNumber(winningNum);
        System.out.println();
        return Parser.parseWinningNumber(winningNum, ",");
    }

    public static int readBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonusNumber = Console.readLine();
        Validator.validateBonusNumber(bonusNumber);
        return Integer.parseInt(bonusNumber);
    }
}
