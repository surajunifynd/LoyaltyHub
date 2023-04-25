package com.example.loyaltyhub.model

import java.io.Serializable

data class Loyalty(
    val totalPoints: Any,
    val referralCode: String,
    val customerReferralUrl: String,
    val referringUserBenefit: Any,
    val referredUserBenefit: Any,
    //val userData: User,
    //val newsFeedList: ArrayList<NewsFeed>,
    //val tagList: ArrayList<Tag>,
    //val newsFeedActivityList: ArrayList<NewsFeed>,
    //val categoryList: ArrayList<Category>,
    //val user: User,
    //val about: RetailerInfoAboutData,
    //val retailerList: ArrayList<RetailerInfoAboutData>,
    //val coupons: ArrayList<RetailerCoupon>,
    //val rewards: ArrayList<RetailerCoupon>,
    //val retailerCatalogPhotos: ArrayList<RetailerCatalogPhoto>,
    //val retailerRatings: RetailerRatings,
    //val homeData: HomeData,
    //val categories: ArrayList<RetailerCategoryCoupon>,
    //val couponsData: ArrayList<RetailerCoupon>,
    //val rewardsData: ArrayList<RetailerCoupon>,
    //val mallInfo: ArrayList<MallCityData>,
    val data: String, // Request OTP response
    val isSignUp: Int,
    val stars: Int,
    val usedGems: Number,
    val availableGems: Number,
    val isTransferable: Boolean,
    val unlockCoupon: Long,
    val unlockReward: Long,
    //val couponHistory: ArrayList<RetailerCoupon>,
    //val rewardHistory: ArrayList<RetailerCoupon>,
    val couponCodeType: Int,
    val rewardCodeType: Int,
    val totalEntries: Int,
    val totalPages: Int,
    val unlockCount: Int,
    val couponCode: String,
    val rewardCode: String,
    val id: Long,
    //val bannerList: ArrayList<Banner>,
    //val notificationList: ArrayList<NotificationObject>,
    //val transactionList: ArrayList<TransactionHistoryList>,
    //val bookingSlot: BookingSlots,
    val redemmedCount: Int, // for coupons
    val redeemedCount: Int, // for rewards
    //val retailerWeekOpenandCloseTimes: ArrayList<RetailerOpenAndCloseTime>,
    //val gemTransactions: ArrayList<Reward>,
    val gems: Number,
    val points: String,
    //val pointTransactions: ArrayList<Reward>,
    //val customerScanHistory: ArrayList<ScanHistoryList>,
    //val ruleList: ArrayList<RuleList>,
    val transactionId: Long,
    val mallId: Long,
    val carNumber: String,
    val carModel: String,
    //val carsData: ArrayList<Car>,
    val isActive: Int,
    val isDeleted: Int,
    //val parking: ParkingHome,
    //val slots: ArrayList<ParkingSlots>,
    //val parkingCost: ParkingCost,
    val bookingId: String,
    val parkingDate: String,
    val slotStart: String,
    val slotEnd: String,
    //val car: Car,
    val mallName: String,
    val status: String,
    val arrivalStatus: Int,
    //val bookingDetails: ParkingBookingObject,
    //val bookings: ArrayList<ParkingBookingObject>,
    //val zones: ArrayList<ParkingZones>,
    //val issueFeatures: ArrayList<IssueFeatures>,
    val isHard: Boolean,
    val isSuggested: Boolean,
    val privacy: String,
    val faqs: String,
    val terms: String,
    val dineoutEnabled: Boolean,
    val giftCardEnabled: Boolean,
    val webUrl: String,
    val giftCardUrl: String,
    //val scanCampaign: ScanCampaign,
    val isEnable: Int,
    //val scratchCards: ArrayList<ScratchCardHistoryList>,
    //val spinWheels: ArrayList<ScratchCardHistoryList>,
    //val transactions: ArrayList<ScratchCardHistoryList>,
    //val rewardCount: ArrayList<RewardCountForScratch>,
    //val docs: ArrayList<TierDetails>,
    //val tierList: ArrayList<TierDetails>,
    //val userTierDetails: TierDetails,
    //val userDetails: User,
    val tierBasedOn: Int,
    val personalStylistEnabled: Boolean,
    val isFavorite: Number,
    //val tableBookingSettings: TableBookingSettings,
    //val sets: ArrayList<SetsData>,
    //val rule: RuleList,
    val loyaltyTerms: String,
    val isExpiring: Number,
    //val survey: SurveyDetail,

    //val rules: ArrayList<RuleList>,
    //val scanCampaignDetails: ScanCampaign,
    //val scanCampaignDetailsV2: ScanCampaignV2,
    val isScratchCardEnable: Int,
    val isSpinWheelEnable: Int,
    val isSurveyEnable: Int,
    val isRuleEnable: Int,
    val isScanCampaignEnable: Int,
    val hasGifts: Int,
    val isImagePuzzleEnable: Int
)
data class PuzzleFeed(
    val puzzles: MutableList<Puzzles>?,
    val totalPoints: String,
    val gems: String,
    val totalPages: Int?,
    val id : String
): Serializable
data class Puzzles(
    val id: String,
    val unlockType: Long,
    val canAttempt: Long,
    val unlockValue: Long,
    val name: String,
    val description: String,
    val termsAndConditions: String,
    val totalAttempts: Long,
    val targeting: Long,
    val attempts: Long,
    val totalPuzzles: Int,
    val totalUsed: Int,
    val image: String,
    val timePeriodInSeconds: Int,
    val imageGridType: Int,
    val benefitsData: ArrayList<BenefitsDataPuzzle>,
) : Serializable
data class BenefitsDataPuzzle(
    val benefitId: Long,
    val benefitType: Long,
    val logo: String,
    val couponName: String,
    val displayName: String,
    val name: String,
    val value: Any,
) : Serializable