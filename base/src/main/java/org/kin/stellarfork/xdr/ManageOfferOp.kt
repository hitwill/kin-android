// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten
package org.kin.stellarfork.xdr

import java.io.IOException

// === xdr source ============================================================
//  struct ManageOfferOp
//  {
//      Asset selling;
//      Asset buying;
//      int64 amount; // amount being sold. if set to 0, clearStorage the offer
//      Price price;  // price of thing being sold in terms of what you are buying
//
//      // 0=create a new offer, otherwise edit an existing offer
//      uint64 offerID;
//  };
//  ===========================================================================
class ManageOfferOp {
    var selling: Asset? = null
    var buying: Asset? = null
    var amount: Int64? = null
    var price: Price? = null
    var offerID: Uint64? = null

    companion object {
        @JvmStatic
        @Throws(IOException::class)
        fun encode(stream: XdrDataOutputStream, encodedManageOfferOp: ManageOfferOp) {
            Asset.encode(stream, encodedManageOfferOp.selling!!)
            Asset.encode(stream, encodedManageOfferOp.buying!!)
            Int64.encode(stream, encodedManageOfferOp.amount!!)
            Price.encode(stream, encodedManageOfferOp.price!!)
            Uint64.encode(stream, encodedManageOfferOp.offerID!!)
        }

        @JvmStatic
        @Throws(IOException::class)
        fun decode(stream: XdrDataInputStream): ManageOfferOp {
            val decodedManageOfferOp = ManageOfferOp()
            decodedManageOfferOp.selling = Asset.decode(stream)
            decodedManageOfferOp.buying = Asset.decode(stream)
            decodedManageOfferOp.amount = Int64.decode(stream)
            decodedManageOfferOp.price = Price.decode(stream)
            decodedManageOfferOp.offerID = Uint64.decode(stream)
            return decodedManageOfferOp
        }
    }
}
