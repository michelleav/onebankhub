package nl.onebank.onebankhub.transfermanagement.repository

import nl.onebank.onebankhub.transfermanagement.entity.TransferHistory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferHistoryRepository : JpaRepository<TransferHistory, Long> {
}