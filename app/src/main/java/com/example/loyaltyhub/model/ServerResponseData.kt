package com.example.loyaltyhub.model

import java.io.Serializable

data class ServerResponseData(
    val totalPoints: Any,
    val referralCode: String,
    val customerReferralUrl: String,
    val referringUserBenefit: Any,
    val referredUserBenefit: Any,
    val userData: User,
    val newsFeedList: ArrayList<NewsFeed>,
    val tagList: ArrayList<Tag>,
    val newsFeedActivityList: ArrayList<NewsFeed>,
    val categoryList: ArrayList<Category>,
    val user: User,
    val about: RetailerInfoAboutData,
    val retailerList: ArrayList<RetailerInfoAboutData>,
    val coupons: ArrayList<RetailerCoupon>,
    val rewards: ArrayList<RetailerCoupon>,
    val retailerCatalogPhotos: ArrayList<RetailerCatalogPhoto>,
    val retailerRatings: RetailerRatings,
    val homeData: HomeData,
    val categories: ArrayList<RetailerCategoryCoupon>,
    val couponsData: ArrayList<RetailerCoupon>,
    val rewardsData: ArrayList<RetailerCoupon>,
    val mallInfo: ArrayList<MallCityData>,
    val data: String, // Request OTP response
    val isSignUp: Int,
    val stars: Int,
    val usedGems: Number,
    val availableGems: Number,
    val isTransferable: Boolean,
    val unlockCoupon: Long,
    val unlockReward: Long,
    val couponHistory: ArrayList<RetailerCoupon>,
    val rewardHistory: ArrayList<RetailerCoupon>,
    val couponCodeType: Int,
    val rewardCodeType: Int,
    val totalEntries: Int,
    val totalPages: Int,
    val unlockCount: Int,
    val couponCode: String,
    val rewardCode: String,
    val id: Long,
    val bannerList: ArrayList<Banner>,
    val notificationList: ArrayList<NotificationObject>,
    val transactionList: ArrayList<TransactionHistoryList>,
    val bookingSlot: BookingSlots,
    val redemmedCount: Int, // for coupons
    val redeemedCount: Int, // for rewards
    val retailerWeekOpenandCloseTimes: ArrayList<RetailerOpenAndCloseTime>,
    val gemTransactions: ArrayList<Reward>,
    val gems: Number,
    val points: String,
    val pointTransactions: ArrayList<Reward>,
    val customerScanHistory: ArrayList<ScanHistoryList>,
    val ruleList: ArrayList<RuleList>,
    val transactionId: Long,
    val mallId: Long,
    val carNumber: String,
    val carModel: String,
    val carsData: ArrayList<Car>,
    val isActive: Int,
    val isDeleted: Int,
    val parking: ParkingHome,
    val slots: ArrayList<ParkingSlots>,
    val parkingCost: ParkingCost,
    val bookingId: String,
    val parkingDate: String,
    val slotStart: String,
    val slotEnd: String,
    val car: Car,
    val mallName: String,
    val status: String,
    val arrivalStatus: Int,
    val bookingDetails: ParkingBookingObject,
    val bookings: ArrayList<ParkingBookingObject>,
    val zones: ArrayList<ParkingZones>,
    val issueFeatures: ArrayList<IssueFeatures>,
    val isHard: Boolean,
    val isSuggested: Boolean,
    val privacy: String,
    val faqs: String,
    val terms: String,
    val dineoutEnabled: Boolean,
    val giftCardEnabled: Boolean,
    val webUrl: String,
    val giftCardUrl: String,
    val scanCampaign: ScanCampaign,
    val isEnable: Int,
    val scratchCards: ArrayList<ScratchCardHistoryList>,
    val spinWheels: ArrayList<ScratchCardHistoryList>,
    val transactions: ArrayList<ScratchCardHistoryList>,
    val rewardCount: ArrayList<RewardCountForScratch>,
    val docs: ArrayList<TierDetails>,
    val tierList: ArrayList<TierDetails>,
    val userTierDetails: TierDetails,
    val userDetails: User,
    val tierBasedOn: Int,
    val personalStylistEnabled: Boolean,
    val isFavorite: Number,
    val tableBookingSettings: TableBookingSettings,
    val sets: ArrayList<SetsData>,
    val rule: RuleList,
    val loyaltyTerms: String,
    val isExpiring: Number,
    val survey: SurveyDetail,

    val rules: ArrayList<RuleList>,
    val scanCampaignDetails: ScanCampaign,
    val scanCampaignDetailsV2: ScanCampaignV2,
    val isScratchCardEnable: Int,
    val isSpinWheelEnable: Int,
    val isSurveyEnable: Int,
    val isRuleEnable: Int,
    val isScanCampaignEnable: Int,
    val hasGifts: Int,
    val isImagePuzzleEnable: Int
)

data class MediaItem(
    val mediaUrl: String,
    val mediaType: String,
    var thumbnailUrl: String = "",
    var thumbnailType: String = ""
) : Serializable

data class ReferralBenefit(
    val benefitType: Int,
    val benefitId: Long,
    val referType: Int,
    val value: Double,
    val displayName: String,
    val name: String,
    val logo: String
) : Serializable

data class RewardTransaction(
    val name: String,
    val couponName: String,
    val displayName: String,
    val logo: String,
    val storeLogo: String
) : Serializable

data class SpinWheelFeed(
    val spinWheels: MutableList<SpinWheels>?,
    val totalPoints: String,
    val gems: String,
    val totalPages: Int?,

    ) : Serializable

data class SpinWheels(
    val spinPerDay: Long,
    val id: Long,
    val totalSpins: Long,
    val unlockType: Long,
    val canAttempt: Long,
    val unlockValue: Long,
    val name: String,
    val description: String,
    val termsAndConditions: String,
    val totalAttempts: Long,
    val attempts: Long,
    val benefitsData: ArrayList<BenefitsDataSpinWin>,
) : Serializable

data class BenefitsDataSpinWin(
    val benefitId: Long,
    val benefitType: Long,
    val logo: String,
    val value: Any,
) : Serializable

data class ExtraImage(
    val image: String,
    val mediaType: String
) : Serializable

data class ParkingSlots(
    val id: Long,
    val parkingId: Long,
    val slotStart: String,
    val slotEnd: String,
    val mallId: Long,
    val totalAvailable: Int,
    val totalBooked: Int
) : Serializable

data class ParkingCost(
    val typeText: String,
    val value: Double,
    val type: Int
) : Serializable

data class IssueFeatures(
    val id: Long,
    val name: String
) : Serializable

data class ParkingHome(
    val parkingEnabled: Int,
    val hasCars: Int,
    val bookings: ParkingBookingObject,
    val available: Long
) : Serializable

data class ParkingZones(
    val parkingId: Long,
    val zoneName: String,
    val availableSlots: Int
) : Serializable

data class TierDetails(
    val id: Long,
    val badgeImage: String,
    val tierName: String,
    val cutOnXp: Long,
    val cutOffXp: Long,
    val gems: Long,
    val recurringGems: Long,
    val multiplier: Long,
    val loyaltyPoints: Long,
    val expiryCount: String,
    val expiredXp: Long,
    val hexCode: String,
    val tierCoupons: Number,
    val tierRewards: Number,
    val tierSpinWheel: Number,
    val tierScratchCards: Number,
    val nextTier: Long,
    var isCompleted: Boolean = false,
    var isCurrentTier: Boolean = false,
    var isNextTier: Boolean = false,
    var isSelected: Boolean = false,
    var isTopCurrent: Boolean = false
) : Serializable

data class RewardCountForScratch(
    val count: Long,
    val benefitType: Long
) : Serializable

data class ParkingBookingObject(
    val id: Long,
    val bookingId: String,
    val mallId: Long,
    val parkingDate: String,
    val slotStart: String,
    val slotEnd: String,
    val isActive: Int,
    val arrivalStatus: Int,
    val value: Int = 0,
    val car: Car,
    val mallName: String,
    val isClosed: Int,
    val reason: String?
) : Serializable

data class TableBookingSettings(
    val isEnabled: Boolean,
    val url: String?
) : Serializable

data class ScratchCardHistoryList(
    val id: String,
    val name: String,
    val mallId: String,
    val mallName: String,
    val createdAt: String,
    val description: String,
    val termsAndConditions: String,
    val backgroundImage: Long,
    val totalAttempts: Long,
    val benefit: Benefit,
    val isExpired: Int,
    val expiredDate: String,
    val transactionId: String
) : Serializable

data class Benefit(
    val value: Long,
    val id: Long,
    val logo: String,
    val message: String,
    val name: String,
    val retailerId: Long,
    val benefitType: Long
) : Serializable

data class MallVisitRetailers(
    val id: Long,
    val personalizedMallVisitId: Long,
    val retailerId: Long,
    val retailerName: String,
    val retailerCategoryId: ArrayList<Category>,
    val retailerLogo: String,
    val isFavorite: Number = 0
) : Serializable

data class SetsData(
    val id: Long,
    val name: String,
    val visitDate: String,
    val mallId: String,
    val note: String,
    val isActive: Number,
    val isDeleted: Number,
    val personalizedMallVisitRetailers: ArrayList<MallVisitRetailers>,
    val mallName: String,
    var isSelected: Boolean,
    var isPreAdded: Boolean,
) : Serializable

data class RetailerDetails(
    val id: Long,
    val retailerName: String,
    val retailerLogo: String,
    val retailerCategories: ArrayList<RetailerCategory>
) : Serializable {
    fun getRetailerCategoriesStr(): String {
        if (this.retailerCategories != null) {
            var categories = ""
            val categoriesArr = this.retailerCategories
            categoriesArr.forEachIndexed { index, retailerCategory ->
                if (index == categoriesArr.size - 1) categories += retailerCategory.categoryName
                else categories += retailerCategory.categoryName + ", "
            }
            return categories
        } else {
            return ""
        }
    }
}

data class SurveyDetail(
    val id: Long,
    val name: String,
    val description: String,
    val imageUrl: String,
    val benefitType: Int,
    val benefitId: Long,
    val benefitValue: Long,
    val defaultType: Int,
    val targetAudience: Int,
    val retailer: RetailerDetails,
    val totalQuestion: Int,
    val answeredQuestion: Int,
    val endDateTime: String,
    val benefitDetails: RetailerCoupon
) : Serializable

data class SCRetailerCategory(
    val id: Long,
    val retailerName: String,
    val retailerLogo: String
) : Serializable

data class RetailerCategory(
    val id: Long,
    val categoryName: String,
    val categoryImage: String = ""
) : Serializable

data class ScanCampaign(
    val id: Long,
    val campaignName: String,
    val startDate: String,
    val campaignType: Int,
    val startTime: String,
    val endTime: String,
    val retailerCategory: ArrayList<SCRetailerCategory>?,
    val threshold: Double,
    val description: String,
    val couponId: Long?,
    val rewardId: Long?,
    val campaignCategory: ArrayList<RetailerCategory>?,
    val endDate: String,
    val benefits: Int,
    val value: Double,
    val isActive: String,
    val isAwarded: String,
    val startDateTimeMS: String,
    val endDateTimeMS: String,
    val coupon: RetailerCoupon?,
    val reward: RetailerCoupon?,
    val campaignRetailers: ArrayList<CampaignRetailers>?,
    val completed: Double,
    val completedPercentage: Double
) : Serializable {
    fun getCompletedCampaignRetailers(): Int {
        var count = 0
        campaignRetailers?.forEach {
            if (it.completed >= it.threshold)
                count += 1
        }
        return count
    }
}

data class CampaignRetailers(
    val benefits: Int,
    val threshold: Double,
    val value: Double,
    val couponId: Long?,
    val rewardId: Long?,
    val retailer: SCRetailerCategory?,
    val coupon: RetailerCoupon?,
    val reward: RetailerCoupon?,
    val isAwarded: String,
    val completed: Double
) : Serializable

data class Car(
    val id: Long,
    val mallId: Long,
    val carNumber: String,
    val carModel: String,
    val isActive: Int,
    val isDeleted: Int
) : Serializable

data class ScanCampaignV2(
    val totalActiveCampaign: Int,
    val completedCampaign: Int
) : Serializable

data class RuleList(
    val id: Long,
    val ruleFrequency: Long,
    val userAttempts: Long,
    val benefits: Long,
    val value: Long,
    val ruleName: String,
    val description: String,
    val startDate: String,
    val ruleId: String,
    val startTime: String,
    val endDate: String,
    val endTime: String,
    val isCompleted: Long,
    val completedOn: String
) : Serializable

data class ScanHistoryList(
    val id: Long,
    val storePic: String,
    val retailerLogo: String,
    val basePoints: Float,
    val tierMultiplier: Long,
    val retailerMultiplier: Long,
    val billTotal: String,
    val storeName: String,
    val createdAt: String,
    val mallName: String,
    val image: String,
    val mediaType: String,
    val billDate: String,
    val location: String,
    val reason: String,
    val allowRescan: Boolean,
    var date: String,
    var points: Number,
    val tierMultiplierPoints: Double,
    val retailerMultiplierPoints: Double,
    val extraImages: ArrayList<ExtraImage>
) : Serializable

data class Reward(
    val id: Long,
    val transactionId: String,
    val type: String,
    val value: String,
    val creditType: Long,
    val debitType: Long,
    val debitTypeId: Long,
    val message: String,
    val transcationDatetime: String,
    val openingBalance: String,
    val closingBalance: String,
    val mallId: Long,
    val mall: String, // Mall name
    val mallCity: String,
    val transactionData: RewardTransaction,
    val retailerName: String,
    val retailerId: Long,
    val logo: String? = ""
) : Serializable

data class RetailerOpenAndCloseTime(
    val id: String,
    val day: String,
    val openTime: String,
    val closeTime: String,
    val isActive: Int
) : Serializable

data class BookingSlots(
    val id: Long,
    val bookingId: String,
    val date: String,
    val startTime: String,
    val endTime: String,
    val persons: Int,
    val qrString: String,
    val bookingLocation: String,
    val isCancelled: Int,
    val cancelReason: String,
    val isUserCancelled: Boolean,
    val isPrams: Int,
    val isWheelchair: Int,
    val mallName: String,
    val mallId: Long
) : Serializable

data class TransactionHistoryList(
    val id: Int,
    val transactionId: String,
    val retailerId: Int,
    val mallId: Long,
    val upiId: String,
    val status: Int,
    val amount: String,
    val isActive: Int,
    val mallName: String,
    val transactionDate: String,
    val transactionTime: String,
    val retailerName: String,
    val retailerLogo: String,
    val createdAt: String
) : Serializable

data class NotificationObject(
    val id: Long,
    val dataMessage: DataMessage,
    val notificationId: Long,
    val createdAt: Long,
    val mallId: Long,
    val isRead: Int,
) : Serializable

data class Banner(
    val id: Long,
    val bannerName: String,
    val screenLocation: String,
    val image: String,
    val bannerType: Int,
    val order: Int,
    val subTypeId: Long,
    val url: String,
    val isActive: Int,
    val isDeleted: Int,
    val mallId: Int
)

data class DataMessage(
    val message_title: String,
    val message_body: String,
    val data_message: ClickHandling
) : Serializable

data class ClickHandling(
    var notification_id: Long,
    var type: Int,
    var mallId: String,
    var sub_type_id: String,
    var image_video: String,
    var url: String,
    var title: String,
    var classification: String,
    var description: String,
    var referral: String,
    var notification_details: String
) : Serializable

data class MallCityData(
    val city: String,
    val malls: ArrayList<Mall>,
    var isSelected: Boolean = false
) : Serializable

data class Mall(
    val id: Long,
    val mallName: String,
    val mallCity: String,
    val mallAddress1: String,
    val mallAddress2: String,
    val mallState: String,
    val mallPincode: String,
    val mallLat: Double,
    val mallLong: Double,
    var isSelected: Boolean = false,
    val shortCode: String,
    val venueId: Int,
    val helpDeskLocations: ArrayList<HelpDeskLocation>
) : Serializable

data class HelpDeskLocation(
    val deskName: String,
    val deskLocation: String
) : Serializable

data class RetailerCategoryCoupon(
    val id: Long,
    val name: String,
    val image: String = "",
    var isSelected: Boolean = false
) : Serializable

data class HomeData(
    val userData: User,
    val booking: BookingSlots,
    val coupons: ArrayList<RetailerCoupon>,
    val rewards: ArrayList<RetailerCoupon>,
    val newsFeeds: ArrayList<NewsFeed>,
    val categories: ArrayList<Category>,
    val banners: ArrayList<Banner>,
    val parking: ParkingHome,
    val homeBottom: ArrayList<Banner>
)

data class RetailerRatings(
    val totalRatingsCount: Long,
    val averageRating: Float,
    val overAllRatings: HashMap<String, Float>
) : Serializable

data class RetailerCatalogPhoto(
    val id: Long,
    val imageUrl: String,
    val thumbnail: String,
    val title: String,
    val mediaType: String
) : Serializable

data class RetailerCoupon(
    var id: Long,
    val displayName: String,
    val description: String,
    val termsAndConditions: String,
    val startDate: String,
    val endDate: String,
    val startTime: String,
    val endTime: String,
    val couponType: Int,
    val rewardType: Int,
    val couponDriven: Int,
    val rewardDriven: Int,
    val name: String,
    val retailerId: String,
    val floor: String,
    val logo: String,
    val backgroundImage: String,
    var couponId: Long,
    var rewardId: Long,
    val couponStatus: Int,
    val rewardStatus: Int,
    val customerId: Long,
    val isTransfer: Int,
    val couponUnlockDateTime: String,
    val couponRedeemDateTime: String,
    val rewardRedeemDateTime: String,
    var couponCodeType: Int,
    var rewardCodeType: Int,
    var couponCode: String,
    var rewardCode: String,
    var isTransferable: Boolean,
    val mallId: Long,
    val gems: Long,
    val points: Long,
    val receiver: Long,
    val transferedOn: String,
    val couponIsactiveStatus: String,
    val rewardIsactiveStatus: String,
    val targetAudienceSetting: String,
    val rewardClassification: Long,
    val couponClassification: Long,
    val classification: String,
    val rewardMonetaryValue: Long,
    val couponMonetaryValue: Long,
    val rewardMonetaryCurrency: String,
    val couponMonetaryCurrency: String,
    var isShowingRewards: Boolean = false,
    val mallName: String,
    val isPhysicalVoucher: Boolean = false,
    val isPhysicallyHandedOver: Int,
    var isSelected: Boolean = false,
    val isFavorite: Number,
    val isPhysicallyDelivered: Number,
    val couponName: String,
    val storeCategory: String,
    val rewardName: String,
    val couponImage: String,
    val rewardImage: String,
    val isFavStore: Boolean,
    val isCurated: Boolean,
    val storeCategoryImage: String,
    val categoryName: String,
    val relatedCoupon: ArrayList<RetailerCoupon>,
    val relatedReward: ArrayList<RetailerCoupon>,
    val imageUrl: String,
    val retailer: RetailerDetails
) : Serializable

data class RetailerPhoto(
    val id: Long,
    val imageUrl: String,
    val mediaType: String
) : Serializable

data class RetailerInfoAboutData(
    val id: Long,
    val retailerName: String,
    val retailerLogo: String,
    val shopAddress: String,
    val shopFloor: String,
    val retailerCoverPhotos: ArrayList<RetailerPhoto>,
    val retailerStorePhotos: ArrayList<RetailerPhoto>,
    val retailerOpenandCloseTime: RetailerOpenAndCloseTime,
    val retailerCategoryId: ArrayList<Category>,
    val retailerCategories: ArrayList<Category>,
    var couponCount: Int,
    val upiId: ArrayList<String>,
    val shopIID: ArrayList<String>,
    val retailerDescription: String,
    val averageRating: String,
    val retailerMarketingMedia: String,
    val retailerMarketingMediaType: String,
    val retailerEmail: String,
    val retailerPhoneNumber: ArrayList<RetailerPhoneNumber>,
    var mallId: Long = -1L,
    val tableBookingUrl: String?,
    var isFavorite: Number,
    var isHeaderVisible: Boolean = false,
    var floorLabel: String = "",
    var floorNumber: Number = 0,
) : Serializable

data class RetailerPhoneNumber(
    val id: Long,
    val countryCode: Long,
    val phoneNumber: Long
) : Serializable

data class Category(
    val id: Long,
    val categoryName: String,
    val categoryImage: String,
    val isActive: Int,
    var isSelected: Boolean = false,
    var mappedStoreCount: Long = 0,
    var isFav: Boolean = false,
    var drawable: Int? = null
) : Serializable

data class Tag(
    val id: Long,
    val hexCode: String,
    val tagName: String
) : Serializable

data class User(
    val id: String,
    var firstName: String,
    var lastName: String,
    val username: String,
    val gemBalance: Number,
    var email: String,
    val profilePic: String,
    val dob: String,
    var gender: String,
    val earnedPoints: Number,
    val burnedPoints: Number,
    val totalPoints: Number,
    val totalXp: Number,
    val expiryPoints: Number,
    val countryCode: Int,
    val address: String,
    val referralCode: String,
    val referredCode: String,
    val mobileNumber: Long,
    val preferredMallId: Long,
    val secondaryMallId: Long,
    val tierId: Long,
    val anniversary: String,
    val age: Int,
    val emailVerified: Int,
    val authToken: String,
    val isExclusive: Int,
    val tier: TierDetails,
    val customerUrl: String,
    val referralBenefit: ReferralBenefit,
    val isPushNotification: Int,
    val isEmailNotification: Int,
    val optedForDeletion: Int,
    val reactivationCode: Any,
    val deletionRequestedAt: String
) : Serializable

data class NewsFeed(
    val id: Long,
    val title: String,
    val description: String,
    val isRetailers: Int,
    val retailerId: Long,
    val isActive: Int,
    val isDeleted: Int,
    val mallId: Long,
    val isFeatured: Int,
    val createdAt: String,
    var userActivity: Int,
    var totalCount: Int,
    var totalLikes: Int,
    var totalLove: Int,
    var totalClaps: Int,
    val media: ArrayList<MediaItem>,
    val tag: Tag,
    val retailerDetails: RetailerDetails,
    val sharedUrl: String
) : Serializable

data class PuzzleFeed(
    val puzzles: MutableList<Puzzles>?,
    val totalPoints: String,
    val gems: String,
    val totalPages: Int?,
    val id: String
) : Serializable

data class SpinWheelFeedWrapper(
    val status: Status,
    val data: SpinWheelFeed
)

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

data class PuzzleFeedWrapper(
    val status: Status,
    val data: PuzzleFeed
)

data class Status(
    val code: Int,
    val message: String
) : Serializable

data class ErrorResponse(val status: Status) : Serializable

data class ServerResponse(
    val status: Status,
    val data: ServerResponseData
)
