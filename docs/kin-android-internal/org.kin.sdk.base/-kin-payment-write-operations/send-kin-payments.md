[kin-android](../../index.md) / [org.kin.sdk.base](../index.md) / [KinPaymentWriteOperations](index.md) / [sendKinPayments](./send-kin-payments.md)

# sendKinPayments

`abstract fun sendKinPayments(payments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`KinPaymentItem`](../../org.kin.sdk.base.models/-kin-payment-item/index.md)`>, memo: `[`KinMemo`](../../org.kin.sdk.base.models/-kin-memo/index.md)` = KinMemo.NONE, sourceAccountSpec: `[`AccountSpec`](../../org.kin.sdk.base.models/-account-spec/index.md)` = AccountSpec.Preferred, destinationAccountSpec: `[`AccountSpec`](../../org.kin.sdk.base.models/-account-spec/index.md)` = AccountSpec.Preferred): `[`Promise`](../../org.kin.sdk.base.tools/-promise/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`KinPayment`](../../org.kin.sdk.base.models/-kin-payment/index.md)`>>`

### Parameters

`payments` -
* a representation of the payments to send as a batch

`memo` - (optional) a memo can be provided to reference what thes batch of payments

`sourceAccountSpec` -
* a spec of how to interpret the source of funds

`destinationAccountSpec` -
* a spec of how to interpret the source of funds
were for. If no memo is desired, then set it to [KinMemo.NONE](../../org.kin.sdk.base.models/-kin-memo/-n-o-n-e.md)

**See Also**

[sendKinPayment](send-kin-payment.md)

**Return**
a [Promise](../../org.kin.sdk.base.tools/-promise/index.md) with the blockchain confirmed [KinPayment](../../org.kin.sdk.base.models/-kin-payment/index.md)s or an error

