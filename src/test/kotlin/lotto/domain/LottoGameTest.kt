package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LottoGameTest {
    @Test
    fun make_many_lotto() {
        val money = Money("10000")

        val lottoGame = LottoGame(money)

        assertThat(lottoGame.lottoList.size).isEqualTo(10)
    }
}