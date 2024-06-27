package nl.onebank.onebankhub.repository

import nl.onebank.onebankhub.entity.TransferHistory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferHistoryRepository : JpaRepository<TransferHistory, Long> {
}